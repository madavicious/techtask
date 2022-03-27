<template>
  <div>
    <v-col class="klasa-kolumny">
      <v-select class="purple--text darken-1"
          v-model="wybranaKolumna"
          :items="kolumny"
          :menu-props="{ top: true, offsetY: true }"
          label="Wybierz kolumnę"
      />
    </v-col>
    <v-col class="klasa-zapytania purple--text">
      <v-select class="purple--text darken-1"
          v-model="wybraneZapytanie"
          :items="zapytania"
          :menu-props="{ top: true, offsetY: true }"
          label="Co chcesz zrobić?"
      />
    </v-col>
  </div>
</template>

<script>
export default {
  name: "ComboBoxes",
  data: () => ({
    kolumny: ['kolumna 1', 'kolumna 2', 'kolumna 3', 'kolumna 4'],
    wybranaKolumna: null,
    zapytania: ['wartości się powtarzają', 'wartości są unikalne'],
    wybraneZapytanie: null,
  }),
  mounted() {
    this.$watch(vm => [vm.wybranaKolumna, vm.wybraneZapytanie], () => {
      if (!!this.wybranaKolumna && !!this.wybraneZapytanie) {

        let column = this.wybranaKolumna.replace(/\s/g, "");
        let isUnique = false;

        if (this.wybraneZapytanie === this.zapytania[1]) {
          isUnique = true;
        }

        this.$emit('sendGetRequest', column, isUnique)
      }
    })
  },
  watch: {}
}
</script>

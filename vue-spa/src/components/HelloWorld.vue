<template>
  <v-container>
    <v-row class="text-center">
      <mock-data :mockData="mockData"/>
      <combo-boxes v-on:sendGetRequest="getValues"/>
    </v-row>
  </v-container>
</template>

<script>
import MockData from "@/components/MockData";
import MockDataService from "@/http-common";
import ComboBoxes from "@/components/ComboBoxes";

export default {
  name: "HelloWorld",
  components: {ComboBoxes, MockData},
  data: () => ({
    mockData: [],
    kolumny: ['kolumna 1', 'kolumna 2', 'kolumna 3', 'kolumna 4'],
    wybranaKolumna: null,
    zapytania: ['wartości się powtarzają', 'wartości są unikalne'],
    wybraneZapytanie: null,
  }),
  methods: {
    getMockData() {
      MockDataService.getMockData()
          .then((response) => {
            this.mockData = response.data;
          }).catch((e) => {
        throw new Error(e);
      })
    },
    getValues(column, isUnique) {
      MockDataService.getValues(column, isUnique)
          .then((response) => {
            this.mockData = response.data
          }).catch((e) => {
        throw new Error(e)
      })
    }
  },
  created() {
    this.getMockData();
  }
}
</script>



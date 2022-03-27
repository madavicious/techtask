<template>
  <v-col cols="12">
    <h1 class="deep-purple--text text--darken-4">
      Zadanie rekrutacyjne
    </h1>
    <p class="purple--text text--darken-2">
      Proszę wybrać numer kolumny, a następnie
      <br>co należy z nią zrobić :)
    </p>
    <div class="container" v-if="mockData && mockData.length !== 0">
      <h2 class="deep-purple--text text--darken-4">Mock Data List</h2>
      <table class="table table-borderless">
        <thead class="purple--text text--darken-1">
        <th>id</th>
        <th>kolumna 1</th>
        <th>kolumna 2</th>
        <th>kolumna 3</th>
        <th>kolumna 4</th>
        </thead>
        <tbody>
        <tr
            v-for="singleMockData in mockData"
            :key="singleMockData.id"
        >
          <td>{{ singleMockData.id }}</td>
          <td>{{ singleMockData.kolumna1 }}</td>
          <td>{{ singleMockData.kolumna2 }}</td>
          <td>{{ singleMockData.kolumna3 }}</td>
          <td>{{ singleMockData.kolumna4 }}</td>
        </tr>
        </tbody>
      </table>
    </div>
  </v-col>
</template>

<script>

export default {
  name: "MockData",
  props: ['mockData'],
}
</script>
<template>
  <v-app>
    <v-app-bar
      app
      color="deep-purple lighten-3"
    >

        <h4 class="deep-purple--text text--darken-4">Magdalena Ruta</h4>
    </v-app-bar>

    <v-main class="deep-purple lighten-4">
      <HelloWorld/>
    </v-main>
  </v-app>
</template>

<script>
import HelloWorld from './components/HelloWorld';

export default {
  name: 'App',

  components: {
    HelloWorld,
  },

  data: () => ({
    //
  }),
};
</script>


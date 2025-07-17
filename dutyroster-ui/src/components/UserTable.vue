<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios'

const users = ref([])
const loading = ref(true)

const fetchUsers = async () => {
  try {
    const response = await axios.get('http://localhost:18080/api/employees')
    users.value = response.data
  } catch (e) {
    console.error('Hiba történt az adatok lekérdezésekor:', e)
  } finally {
    loading.value = false
  }
}

onMounted(fetchUsers)
</script>

<template>
  <div class="container">
    <h1>User Data</h1>
    <table v-if="!loading">
      <thead>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Job</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="user in users" :key="user.id">
        <td>{{ user.id }}</td>
        <td>{{ user.name }}</td>
        <td>{{ user.jobTitle }}</td>
      </tr>
      </tbody>
    </table>
    <p v-else>Loading...</p>
  </div>
</template>

<style scoped>
.container {
  width: 100%;
  min-width: 100%;
  background: white;
  padding: 1.5rem;
  border-radius: 8px;
  box-shadow: 0 2px 10px rgba(0,0,0,0.1);
  box-sizing: border-box;
}

h1 {
  text-align: center;
  margin-bottom: 1rem;
}

table {
  width: 100%;
  border-collapse: collapse;
  table-layout: auto;
}

th, td {
  border: 1px solid #ccc;
  padding: 0.75rem;
  text-align: left;
}

th {
  background-color: #eee;
}

p {
  text-align: center;
}
</style>

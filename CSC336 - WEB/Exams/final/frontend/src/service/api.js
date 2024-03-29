import axios from "axios"


const url = "http://localhost:5000/api"

export const setToken = (token) => {
    axios.defaults.headers.common['Authorization'] = `Bearer ${token}`;
}

export const getStudents = async () => {
    return await axios.get(`${url}/get`)
}

export const addStudent = async (payload) => {
    return await axios.post(`${url}/add`, payload)
}

// export const getPosts = async () => {
//     return await axios.get(`${url}/`)
// }

// export const getPost = async (article) => {
//     return await axios.get(`${url}/p/${article.slug}`)
// }

// export const addPost = async (article) => {
//     return await axios.post(`${url}/n`, article)
// }

// export const editPost = async (article) => {
//     return await axios.put(`${url}/e/${article.slug}`, article)
// }

// export const deletePost = async (article) => {
//     return await axios.delete(`${url}/d/${article.slug}`, article)
// }

// export const userLogin = async (userData) => {
//     return await axios.post(`${url}/auth/login`, userData)
// }

// export const userRegister = async (userData) => {
//     return await axios.post(`${url}/auth/register`, userData)
// }
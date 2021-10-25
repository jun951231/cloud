import { createAsyncThunk, createSlice } from '@reduxjs/toolkit';
import { userApi } from 'features/user';

const userJoinPage = async(x) => {
  const res = await userApi.userJoin(x)
  return res.data
}

const userFetchonePage = async(x) => {
  const res = await userApi.userFetchOne(x)
  return res.data
}

const userFetchListPage = async() => {
  const res = await userApi.userFetchList()
  return res.data
}

const userLoginPage = async(x) => {
  const res = await userApi.userLogin(x)
}

const userModifyPage = async(x) => {
  const res = await userApi.userModify(x)
}

const userRemovePage = async(x) => {
  const res = await userApi.userRemove(x)
}


export const  joinpage = createAsyncThunk('users/join', userJoinPage)
export const  fetchonePage = createAsyncThunk('users/one', userFetchonePage)
export const  fetchListPage = createAsyncThunk('users/list', userFetchListPage)
export const  loginPage = createAsyncThunk('users/login', userLoginPage)
export const  modifyPage = createAsyncThunk('users/modify', userModifyPage)
export const  removePage = createAsyncThunk('users/remove', userRemovePage)


export default userSlice.reducer;



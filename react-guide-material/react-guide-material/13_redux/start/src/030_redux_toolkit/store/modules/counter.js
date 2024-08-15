import { createSlice } from "@reduxjs/toolkit";

const counter = createSlice({
  name: 'counter',
  initialState: {
    count: 0,
  },
  reducers: {
    add(state, {type, payload}) {
      const newState = {...state};
      newState.count = state.count + payload
      return newState.count;
    },
    minus(state, {type, payload}) {
      const newState = {...state};
      newState.count = state.count - payload
      return newState.count;
    }
  }
})

const { add , minus } = counter.actions;

export { add, minus }
export default counter.reducer
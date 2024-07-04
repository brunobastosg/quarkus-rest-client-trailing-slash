import express from "express";

const app = express();
const port = 3000;

app.enable("strict routing");

app.get("/endpoint-with-trailing-slash/", (req, res) => {
  res.send("OK");
});

app.listen(port, () => {
  console.log(`Server listening on port ${port}`);
});

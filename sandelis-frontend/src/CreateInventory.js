import React from "react";

export default function CreateInventory() {
  const [name, setName] = React.useState("");
  const [weight, setWeight] = React.useState("");
  const [sector, setSector] = React.useState("");
  const [date, setPlacingDate] = React.useState("");

  const handleSubmit = (event) => {
    console.log(`
      Name: ${"Petras"}
      Surname: ${"Petras"}
    `);
    
    event.preventDefault();
  }

  return (
    <form onSubmit={handleSubmit}>
      <h1>Create Inventory</h1>

      <label>
        Name:
        <input
          name="name"
          type="name"
          value={name}
          onChange={e => setName(e.target.value)}
          required />
      </label>
      <label>
        Weight:
        <input
          name="weight"
          type="number"
          value={weight}
          onChange={e => setWeight(e.target.value)}
          required />
      </label>
      <label>
        Placing Sector:
        <input
          name="sector"
          type="number"
          value={sector}
          onChange={e => setSector(e.target.value)}
          required />
      </label>
      <label>
        Placing Date:
        <input
          name="placing date"
          type="date"
          value={date}
          onChange={e => setPlacingDate(e.target.value)}
          required />
      </label>
      

      <button>Submit</button>
    </form>
  );
}

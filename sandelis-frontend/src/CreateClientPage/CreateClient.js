import React from "react";

export default function CreateClient() {
  const [name, setName] = React.useState("");
  const [surname, setSurName] = React.useState("");
  const [date, setBirthDate] = React.useState("");
  const [phonenumb, setPhoneNumber] = React.useState("");
  const [, setClientType] = React.useState("");


  const handleSubmit = (event) => {
    console.log(`
      Name: ${"Petras"}
      Surname: ${"Petras"}
    `);
    
    event.preventDefault();
  }

  return (
    <form onSubmit={handleSubmit}>
      <h1>Create Client</h1>

      <label>
        Name:
        <input
          name="name"
          type="string"
          value={name}
          onChange={e => setName(e.target.value)}
          required />
      </label>
      <label>
        Surname:
        <input
          name="surname"
          type="string"
          value={surname}
          onChange={e => setSurName(e.target.value)}
          required />
      </label>
      <label>
        Birth Date:
        <input
          name="date"
          type="date"
          value={date}
          onChange={e => setBirthDate(e.target.value)}
          required />
      </label>
      <label>
        Phone Number:
        <input
          name="phonenumb"
          type="number"
          value={phonenumb}
          onChange={e => setPhoneNumber(e.target.value)}
          required />
      </label>
      
      <label>
          ─»prastinis:
          <input
            name="clientype"
            type="checkbox"
            onChange={e => setClientType(e.target.value)}
          required />
        
          lojalus klientas:
           <input
            name="clientype"
            type="checkbox"
            onChange={e => setClientType(e.target.value)}
          required />
        </label>


      <button>Submit</button>
    </form>
  );
}

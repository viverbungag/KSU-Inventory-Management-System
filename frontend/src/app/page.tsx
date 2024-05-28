import Image from "next/image";
import Dashboard from "./Components/Dashboard/Dashboard";
export default function Home() {
  return (
  <>
  <div className="container-xl bg-red-700 m-10">
    <h1>Dashboard</h1>
    <Dashboard />
  </div>
  </>
  );
}

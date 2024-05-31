import Image from "next/image";
import Dashboard from "./Components/Dashboard/Dashboard";
import DashboardInformationSection from "./Components/Dashboard/DashboardComponents/DashboardInformationSection";
export default function Home() {
  return (
  <>
  <div className="container-xl m-10">
    
    <Dashboard header="Dashboard">
      <DashboardInformationSection />
    </Dashboard>
  </div>
  </>
  );
}

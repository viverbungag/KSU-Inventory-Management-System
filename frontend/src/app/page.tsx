import Image from "next/image";
import Dashboard from "./Components/Dashboard/Dashboard";
import DashboardInformationSection from "./Components/Dashboard/DashboardComponents/DashboardInformationSection";
export default function Home() {
  return (
  <>
  <div>
    
    <Dashboard header="Dashboard">
      <DashboardInformationSection />
    </Dashboard>
  </div>
  </>
  );
}

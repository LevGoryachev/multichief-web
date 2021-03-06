import Head from 'next/head'
import Image from 'next/image'
import styles from '../styles/Home.module.css'

const Home = () => (
    <div className={styles.container}>
      <Head>
        <title>MultiChief</title>
        <meta name="description" content="MultiChief web-app" />
        <link rel="icon" href="/favicon.ico" />
      </Head>

      <main className={styles.main}>
        <h1 className={styles.title}>
          Welcome to <a href="https://nextjs.org">MultiChief Web App!</a>
        </h1>

        <p className={styles.description}>
          ERP system for construction industry
        </p>

        <div className={styles.grid}>
          <a href="https://github.com/LevGoryachev/MultiChiefMain" className={styles.card}>
            <h2>MultiChiefMain &rarr;</h2>
            <p>Main project (orchestration services) of experimental ERP system MultiChief.</p>
          </a>

          <a href="https://github.com/LevGoryachev/MultiChiefConstruction" className={styles.card}>
            <h2>MultiChiefConstruction &rarr;</h2>
            <p>Construction site service (microservice).</p>
          </a>

          <a href="https://github.com/LevGoryachev/ForGeo" className={styles.card}>
            <h2>ForGeo</h2>
            <p>Location web-service.</p>
          </a>

          <a href="https://github.com/LevGoryachev/PollingService" className={styles.card}>
            <h2>PollingService &rarr;</h2>
            <p>Polls (microservice).</p>
          </a>

          <a href="https://github.com/LevGoryachev/MultiChiefInventory" className={styles.card}>
            <h2>MultiChiefInventory &rarr;</h2>
            <p>Material resourse service (microservice).</p>
          </a>

          <a href="https://github.com/LevGoryachev/MultiChiefStaff" className={styles.card}>
            <h2>MultiChiefStaff &rarr;</h2>
            <p>Staff management service (microservice).</p>
          </a>

        </div>
      </main>

      <footer className={styles.footer}>

      </footer>
    </div>
  );

export default Home;
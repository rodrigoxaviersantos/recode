import Link from "next/link";
import styles from "../styles/style.module.css";

export default function Home() {
  return (
    <div>
      <div className={styles.titleContainer}>
        <h1>My-App</h1>
      </div>
      <div className={styles.menuContainer}>
        <ul className={styles.ulContainer}>
          {/*  menu */}
          <li className={styles.listItem}>
            <Link href="/home" className={styles.link}>
              Home
            </Link>
          </li>
          <li className={styles.listItem}>
            <Link href="/sobre" className={styles.link}>
              Sobre
            </Link>
          </li>
          <li className={styles.listItem}>
            <Link href="/servicos" className={styles.link}>
              Serviços
            </Link>
          </li>
          <li className={styles.listItem}>
            <Link href="/contato" className={styles.link}>
              Contato
            </Link>
          </li>
        </ul>
      </div>
    </div>
  );
}

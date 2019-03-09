public class Premio {
        private Fruta[] ComboGanador;
        private int premio;
        
        public Fruta[] getCombGanad() {
                return ComboGanador;
        }
 
        public int getPremio() {
                return premio;
        }
 
        // CONSTRUCTORES
        public Premio(Fruta[] combinacion, int p) {
                ComboGanador=combinacion;
                premio=p;
        }
}


package org.example;

public class IngressoCinema {
    DiaSemana diaSemana;
    private boolean estudante;

    /**
     *
     *  @param diaSemana
     *  @param estudante
     */
    public IngressoCinema(DiaSemana diaSemana, boolean estudante) {
        this.diaSemana = diaSemana;
        this.estudante = estudante;
    }

    /**
     *
     * @return DiaSemana
     *
     */
    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    /**
     *
      * @param diaSemana
     *   @throws IllegalArgumentException
     */
    public void setDiaSemana(DiaSemana diaSemana) throws IllegalArgumentException{
        if (diaSemana == null ) throw new IllegalArgumentException("");
        this.diaSemana = diaSemana;
    }

    /**
     *
     * @return isEstudante
     */
    public boolean isEstudante() {
        return estudante;
    }

    /**
     *
     * @param estudante
     */

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

    /**
     *
     *  @return precoIngresso
     */
    public float precoIngresso(){
        float ingresso = 15;
        float aumento = ingresso * 0.4F;
        float descontoEstudante = ingresso * 0.3F;
        if (estudante == true){
            if (diaSemana == diaSemana.SEGUNDA || diaSemana == diaSemana.SEXTA){
                return ingresso - descontoEstudante;
            }
            if (diaSemana == diaSemana.DOMINGO || diaSemana == diaSemana.SABADO){
                return (ingresso + aumento)  - descontoEstudante;
            }
        }
        if (diaSemana == diaSemana.TERCA || diaSemana == diaSemana.QUARTA || diaSemana == diaSemana.QUINTA){
            return ingresso * 0.5F;
        }
        if (diaSemana == diaSemana.DOMINGO || diaSemana == diaSemana.SABADO){
            return ingresso + aumento;
        }
        return ingresso;
    }

}

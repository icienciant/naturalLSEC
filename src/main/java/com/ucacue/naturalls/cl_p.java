/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucacue.naturalls;
import edu.stanford.nlp.simple.*;
import java.util.Properties;
import edu.stanford.nlp.io.*;

/**
 *
 * @author Christian Ferndz
 */
public class cl_p {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a document. No computation is done yet.
       Properties props = new Properties();

        // We need part-of-speech annotations (and tokenization /
        // sentence-splitting, which are required for POS tagging)
        props.setProperty("annotators", "tokenize,ssplit,pos,parse,lemma,ner,dcoref");

        // Tokenize using Spanish settings
        props.setProperty("tokenize.language", "es");

        // Load the Spanish POS tagger model (rather than the
        // default English model)
        props.setProperty("pos.model",
            "edu/stanford/nlp/models/pos-tagger/spanish/spanish-distsim.tagger");
       Sentence sen=new Sentence("Mi gato sube arboles, a el le gusta el pezacado", props);
        System.out.println("Iniciando analisis");
        System.out.println("\n Load...");
        System.out.println("\nEl resultado es : "+sen.originalText(0)); //FUNCIONA CON ORACIONES
      //  System.out.println("\nEl resultado es: "+sen.tokens());         // NO FOUND
      //  System.out.println("\nEl resultado es: "+sen.sentenceIndex()); // ARREGLAR 0
       // System.out.println("\nEl resultado es: "+sen.lemmas()); //SI SIRE
        //System.out.println("\nEl resultado es: "+sen.nerTags()); // ERROR         
        //System.out.println("\nEl resultado es: "+sen.nerTags()); // ERROR 
        System.out.println("\nEl resultado es: "+sen.posTags());
       // System.out.println("\nEl resultado es: "+sen.coref()); //error
        
        
    }
    
}
/*

ROOT 
(S 
    (VP 
        (VB Mi) 
            (NP 
                (JJ gato) 
                (NN sube) 
                (NNS arboles)
            )
        )
    )
)

token****************
El resultado es: [
edu.stanford.nlp.simple.Token@1dfe2924, e
du.stanford.nlp.simple.Token@6ebc05a6, 
edu.stanford.nlp.simple.Token@6e6c3152,
edu.stanford.nlp.simple.Token@50b494a6,
edu.stanford.nlp.simple.Token@3cef309d,
edu.stanford.nlp.simple.Token@32709393,
edu.stanford.nlp.simple.Token@3d99d22e,
edu.stanford.nlp.simple.Token@49fc609f,
edu.stanford.nlp.simple.Token@cd2dae5, 
edu.stanford.nlp.simple.Token@3a883ce7, 
edu.stanford.nlp.simple.Token@4973813a]
*/
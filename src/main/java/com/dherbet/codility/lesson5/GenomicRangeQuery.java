package com.dherbet.codility.lesson5;

import java.util.Arrays;

/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/training9APRD9-8A4/
 * Category: RESPECTABLE
 * Level: MEDIUM
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class GenomicRangeQuery {

	public int[] solution(String S, int[] P, int[] Q) {
		System.out.println("S: " + S + ", P: " + Arrays.toString(P) + ", Q: " + Arrays.toString(Q));
		int[] appearancesOfAs = new int[S.length()];
        int[] appearancesOfCs = new int[S.length()];
        int[] appearancesOfGs = new int[S.length()];

		for (int i = 0; i < S.length() ; i++) {
		    char genomic = S.charAt(i);
		    if (genomic == 'A') {
		        if (i != 0) {
                    appearancesOfAs[i] = appearancesOfAs[i - 1] + 1;
                    appearancesOfCs[i] = appearancesOfCs[i - 1];
                    appearancesOfGs[i] = appearancesOfGs[i - 1];
                } else {
                    appearancesOfAs[i]++;
                }
            }
            if (genomic == 'C') {
                if (i != 0) {
                    appearancesOfCs[i] = appearancesOfCs[i - 1] + 1;
                    appearancesOfAs[i] = appearancesOfAs[i - 1];
                    appearancesOfGs[i] = appearancesOfGs[i - 1];
                } else {
                    appearancesOfCs[i]++;
                }
            }
            if (genomic == 'G') {
                if (i != 0) {
                    appearancesOfGs[i] = appearancesOfGs[i - 1] + 1;
                    appearancesOfCs[i] = appearancesOfCs[i - 1];
                    appearancesOfAs[i] = appearancesOfAs[i - 1];
                } else {
                    appearancesOfGs[i]++;
                }
            }
            if (genomic == 'T') {
                if (i != 0) {
                    appearancesOfGs[i] = appearancesOfGs[i - 1];
                    appearancesOfCs[i] = appearancesOfCs[i - 1];
                    appearancesOfAs[i] = appearancesOfAs[i - 1];
                }
            }

		}

        int[] consecutiveAnswersToQueries = new int[P.length];
		for (int i = 0; i < P.length; i++) {
			int p = P[i];
			int q = Q[i];
			if (p == q) {
				consecutiveAnswersToQueries[i] = getNucleotidesFactor(S.charAt(p));
			} else {
			    if (p == 0) {
                    if (appearancesOfAs[q] != 0) {
                        consecutiveAnswersToQueries[i] = getNucleotidesFactor('A');
                    } else if (appearancesOfCs[q] != 0) {
                        consecutiveAnswersToQueries[i] = getNucleotidesFactor('C');
                    } else if (appearancesOfGs[q] != 0) {
                        consecutiveAnswersToQueries[i] = getNucleotidesFactor('G');
                    } else {
                        consecutiveAnswersToQueries[i] = getNucleotidesFactor('T');
                    }
                } else {
                    if (appearancesOfAs[q] - appearancesOfAs[p - 1] != 0) {
                        consecutiveAnswersToQueries[i] = getNucleotidesFactor('A');
                    } else if (appearancesOfCs[q] - appearancesOfCs[p - 1] != 0) {
                        consecutiveAnswersToQueries[i] = getNucleotidesFactor('C');
                    } else if (appearancesOfGs[q] - appearancesOfGs[p - 1] != 0) {
                        consecutiveAnswersToQueries[i] = getNucleotidesFactor('G');
                    } else {
                        consecutiveAnswersToQueries[i] = getNucleotidesFactor('T');
                    }
                }
			}
		}

		System.out.println("Consecutive answers to queries: " + Arrays.toString(consecutiveAnswersToQueries));
		return consecutiveAnswersToQueries;
	}

	private int getNucleotidesFactor(char genomic) {
        if (genomic == 'A') {
            return 1;
        }
        if (genomic == 'C') {
            return 2;
        }
        if (genomic == 'G') {
            return 3;
        }
        return 4;
    }

}
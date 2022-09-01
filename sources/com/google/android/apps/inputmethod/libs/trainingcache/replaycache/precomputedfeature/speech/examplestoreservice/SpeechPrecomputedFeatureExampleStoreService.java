package com.google.android.apps.inputmethod.libs.trainingcache.replaycache.precomputedfeature.speech.examplestoreservice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@hjj
/* loaded from: classes.dex */
public class SpeechPrecomputedFeatureExampleStoreService extends fwj {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService");
    private Executor b;

    public static nnx b(String str) {
        nfh t = nnx.c.t();
        List k = lfy.c('-').k((String) lre.an(lfy.c('.').i(str)));
        try {
            String str2 = (String) k.get(0);
            String str3 = (String) k.get(1);
            try {
                long parseLong = Long.parseLong(str2);
                try {
                    int parseInt = Integer.parseInt(str3);
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    nnx nnxVar = (nnx) t.b;
                    nnxVar.a = parseLong;
                    nnxVar.b = parseInt;
                    return (nnx) t.cz();
                } catch (NumberFormatException unused) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService", "maybeBuildResumptionPoint", 362, "SpeechPrecomputedFeatureExampleStoreService.java")).t("maybeBuildResumptionPoint() : COULD not parse sequence id retrieved from feature file path.");
                    return null;
                }
            } catch (NumberFormatException unused2) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService", "maybeBuildResumptionPoint", 353, "SpeechPrecomputedFeatureExampleStoreService.java")).t("maybeBuildResumptionPoint() : COULD not parse session id retrieved from feature file path.");
                return null;
            }
        } catch (IndexOutOfBoundsException unused3) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService", "maybeBuildResumptionPoint", 342, "SpeechPrecomputedFeatureExampleStoreService.java")).t("maybeBuildResumptionPoint() : COULD not retrieve session id and sequence number from feature file path.");
            return null;
        }
    }

    @Override // defpackage.fwj
    public final void a(String str, byte[] bArr, byte[] bArr2, fwi fwiVar, mzg mzgVar) {
        nnx nnxVar = null;
        if (this.b == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService", "startQuery", 70, "SpeechPrecomputedFeatureExampleStoreService.java")).t("startQuery() : No background executor.");
            fwiVar.a(10, null);
        } else if (!str.equals("/speech_precomputed_feature_data")) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService", "startQuery", 76, "SpeechPrecomputedFeatureExampleStoreService.java")).w("startQuery() : Unrecognized collection %s", str);
            fwiVar.a(10, null);
        } else if (bArr == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService", "startQuery", 82, "SpeechPrecomputedFeatureExampleStoreService.java")).t("startQuery() : Null criteria.");
            fwiVar.a(10, null);
        } else {
            try {
                try {
                    nem nemVar = ((ndy) nfm.z(ndy.c, bArr, nfb.b())).b;
                    nfb b = nfb.b();
                    nnw nnwVar = nnw.d;
                    ner l = nemVar.l();
                    nfm nfmVar = (nfm) nnwVar.N(4);
                    try {
                        try {
                            nho b2 = nhh.a.b(nfmVar);
                            b2.h(nfmVar, nes.p(l), b);
                            b2.f(nfmVar);
                            try {
                                l.z(0);
                                nfm.O(nfmVar);
                                nnw nnwVar2 = (nnw) nfmVar;
                                String str2 = nnwVar2.b;
                                if (!str2.isEmpty()) {
                                    String str3 = nnwVar2.a;
                                    if (str3.isEmpty()) {
                                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService", "startQuery", 120, "SpeechPrecomputedFeatureExampleStoreService.java")).t("startQuery() : Empty precomputed feature data file path.");
                                        fwiVar.a(10, null);
                                        return;
                                    }
                                    if (bArr2.length > 0) {
                                        nfh t = nnx.c.t();
                                        try {
                                            try {
                                                nem nemVar2 = ((ndy) nfm.z(ndy.c, bArr2, nfb.b())).b;
                                                nfb b3 = nfb.b();
                                                nny nnyVar = nny.b;
                                                ner l2 = nemVar2.l();
                                                nfm nfmVar2 = (nfm) nnyVar.N(4);
                                                try {
                                                    try {
                                                        nho b4 = nhh.a.b(nfmVar2);
                                                        b4.h(nfmVar2, nes.p(l2), b3);
                                                        b4.f(nfmVar2);
                                                        try {
                                                            l2.z(0);
                                                            nfm.O(nfmVar2);
                                                            File file = new File(getFilesDir(), ((nny) nfmVar2).a);
                                                            if (jan.b.g(file)) {
                                                                try {
                                                                    FileInputStream fileInputStream = new FileInputStream(file);
                                                                    nnx nnxVar2 = (nnx) nfm.x(nnx.c, fileInputStream, nfb.b());
                                                                    long j = nnxVar2.a;
                                                                    if (t.c) {
                                                                        t.cD();
                                                                        t.c = false;
                                                                    }
                                                                    nnx nnxVar3 = (nnx) t.b;
                                                                    nnxVar3.a = j;
                                                                    nnxVar3.b = nnxVar2.b;
                                                                    fileInputStream.close();
                                                                } catch (IOException e) {
                                                                    ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService", "maybeGetResumptionPoint", (char) 200, "SpeechPrecomputedFeatureExampleStoreService.java")).t("maybeGetResumptionPoint() : ResumptionPoint proto parsing error.");
                                                                    nnxVar = (nnx) t.cz();
                                                                }
                                                            }
                                                            nnxVar = (nnx) t.cz();
                                                        } catch (ngd e2) {
                                                            throw e2;
                                                        }
                                                    } catch (ngd e3) {
                                                        if (e3.a) {
                                                            throw new ngd(e3);
                                                        }
                                                        throw e3;
                                                    } catch (IOException e4) {
                                                        if (e4.getCause() instanceof ngd) {
                                                            throw ((ngd) e4.getCause());
                                                        }
                                                        throw new ngd(e4);
                                                    }
                                                } catch (nhz e5) {
                                                    throw e5.a();
                                                } catch (RuntimeException e6) {
                                                    if (e6.getCause() instanceof ngd) {
                                                        throw ((ngd) e6.getCause());
                                                    }
                                                    throw e6;
                                                }
                                            } catch (ngd e7) {
                                                ((ltd) ((ltd) ((ltd) a.d()).i(e7)).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService", "maybeGetResumptionPoint", (char) 182, "SpeechPrecomputedFeatureExampleStoreService.java")).t("maybeGetResumptionPoint() : ResumptionPointFilePath proto parsing error.");
                                            }
                                        } catch (ngd e8) {
                                            ((ltd) ((ltd) ((ltd) a.d()).i(e8)).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService", "maybeGetResumptionPoint", (char) 171, "SpeechPrecomputedFeatureExampleStoreService.java")).t("maybeGetResumptionPoint() : Could not parse Any proto from resumptionToken.");
                                        }
                                    }
                                    kcu.U(kcu.O(new cak(new File(nnwVar2.c ? getCacheDir() : getFilesDir(), str3), str2, nnxVar, 10), this.b), new bvo(fwiVar, str3, 18), this.b);
                                    return;
                                }
                                fwiVar.a(10, null);
                            } catch (ngd e9) {
                                throw e9;
                            }
                        } catch (RuntimeException e10) {
                            if (e10.getCause() instanceof ngd) {
                                throw ((ngd) e10.getCause());
                            }
                            throw e10;
                        } catch (ngd e11) {
                            if (e11.a) {
                                throw new ngd(e11);
                            }
                        }
                    } catch (IOException e12) {
                        if (e12.getCause() instanceof ngd) {
                            throw ((ngd) e12.getCause());
                        }
                        throw new ngd(e12);
                    } catch (nhz e13) {
                        throw e13.a();
                    }
                } catch (ngd e14) {
                    ((ltd) ((ltd) ((ltd) a.d()).i(e14)).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService", "startQuery", 'g', "SpeechPrecomputedFeatureExampleStoreService.java")).t("startQuery() : SpeechPrecomputedFeatureSelectionCriteria proto parsing error.");
                    fwiVar.a(10, null);
                }
            } catch (ngd e15) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e15)).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService", "startQuery", '[', "SpeechPrecomputedFeatureExampleStoreService.java")).t("startQuery() : Could not parse Any proto from criteria.");
                fwiVar.a(10, null);
            }
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.b = gxo.a(9);
    }
}

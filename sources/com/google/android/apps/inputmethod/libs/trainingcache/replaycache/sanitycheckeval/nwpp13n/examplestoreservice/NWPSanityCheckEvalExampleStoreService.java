package com.google.android.apps.inputmethod.libs.trainingcache.replaycache.sanitycheckeval.nwpp13n.examplestoreservice;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
@hjj
/* loaded from: classes.dex */
public class NWPSanityCheckEvalExampleStoreService extends fwj {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/nwpp13n/examplestoreservice/NWPSanityCheckEvalExampleStoreService");
    public Map b;
    private Executor c;
    private eyf d;

    @Override // defpackage.fwj
    public final void a(String str, byte[] bArr, byte[] bArr2, fwi fwiVar, mzg mzgVar) {
        if (this.c == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/nwpp13n/examplestoreservice/NWPSanityCheckEvalExampleStoreService", "startQuery", 75, "NWPSanityCheckEvalExampleStoreService.java")).t("startQuery() : No background executor at query time.");
            fwiVar.a(10, null);
        } else if (!str.equals("/nwp_sanity_check_eval_data")) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/nwpp13n/examplestoreservice/NWPSanityCheckEvalExampleStoreService", "startQuery", 81, "NWPSanityCheckEvalExampleStoreService.java")).w("startQuery() : Unrecognized collection [%s] sent to SanityCheckEvalExampleStoreSource.", str);
            fwiVar.a(10, null);
        } else if (bArr == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/nwpp13n/examplestoreservice/NWPSanityCheckEvalExampleStoreService", "startQuery", 89, "NWPSanityCheckEvalExampleStoreService.java")).t("startQuery() : Null criteria sent to NWPSanityCheckEvalExampleStoreService.");
            fwiVar.a(10, null);
        } else {
            try {
                try {
                    nem nemVar = ((ndy) nfm.z(ndy.c, bArr, nfb.b())).b;
                    nfb b = nfb.b();
                    nnv nnvVar = nnv.b;
                    ner l = nemVar.l();
                    nfm nfmVar = (nfm) nnvVar.N(4);
                    try {
                        try {
                            try {
                                try {
                                    nho b2 = nhh.a.b(nfmVar);
                                    b2.h(nfmVar, nes.p(l), b);
                                    b2.f(nfmVar);
                                    try {
                                        l.z(0);
                                        nfm.O(nfmVar);
                                        String str2 = ((nnv) nfmVar).a;
                                        if (str2.isEmpty()) {
                                            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/nwpp13n/examplestoreservice/NWPSanityCheckEvalExampleStoreService", "startQuery", 120, "NWPSanityCheckEvalExampleStoreService.java")).t("startQuery() : Sanity check eval locale from selection criteria is empty in NWPSanityCheckEvalExampleStoreSource");
                                            fwiVar.a(10, null);
                                            return;
                                        }
                                        jav javVar = jav.d;
                                        try {
                                            final jav f = jav.f(str2);
                                            List list = (List) this.b.get(f);
                                            if (list == null || list.isEmpty()) {
                                                final eyf eyfVar = this.d;
                                                kcu.U(mio.g(eyfVar.c.b("sanitycheckevaluation"), new leq() { // from class: eye
                                                    /* JADX WARN: Removed duplicated region for block: B:104:0x01e1  */
                                                    /* JADX WARN: Removed duplicated region for block: B:113:0x022d  */
                                                    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
                                                    /* JADX WARN: Type inference failed for: r7v5 */
                                                    /* JADX WARN: Type inference failed for: r7v6 */
                                                    @Override // defpackage.leq
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                                    */
                                                    public final java.lang.Object a(java.lang.Object r19) {
                                                        /*
                                                            Method dump skipped, instructions count: 766
                                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.eye.a(java.lang.Object):java.lang.Object");
                                                    }
                                                }, eyfVar.d), new cvt(this, str2, fwiVar, 8), this.c);
                                                return;
                                            }
                                            fwiVar.b(new eya(list.iterator(), 1));
                                        } catch (IllegalArgumentException e) {
                                            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/nwpp13n/examplestoreservice/NWPSanityCheckEvalExampleStoreService", "startQuery", 131, "NWPSanityCheckEvalExampleStoreService.java")).w("startQuery() : Invalid language tag: %s", javVar);
                                            fwiVar.a(10, null);
                                        }
                                    } catch (ngd e2) {
                                        throw e2;
                                    }
                                } catch (ngd e3) {
                                    if (e3.a) {
                                        throw new ngd(e3);
                                    }
                                }
                            } catch (IOException e4) {
                                if (e4.getCause() instanceof ngd) {
                                    throw ((ngd) e4.getCause());
                                }
                                throw new ngd(e4);
                            }
                        } catch (RuntimeException e5) {
                            if (e5.getCause() instanceof ngd) {
                                throw ((ngd) e5.getCause());
                            }
                            throw e5;
                        }
                    } catch (nhz e6) {
                        throw e6.a();
                    }
                } catch (ngd e7) {
                    ((ltd) ((ltd) ((ltd) a.d()).i(e7)).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/nwpp13n/examplestoreservice/NWPSanityCheckEvalExampleStoreService", "startQuery", 111, "NWPSanityCheckEvalExampleStoreService.java")).w("startQuery() : Could not parse SanityCheckEvalSelectionCriteria proto: %s", e7.getMessage());
                    fwiVar.a(10, null);
                }
            } catch (ngd e8) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e8)).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/nwpp13n/examplestoreservice/NWPSanityCheckEvalExampleStoreService", "startQuery", 99, "NWPSanityCheckEvalExampleStoreService.java")).w("startQuery() : Could not parse Any proto from criteria: %s", e8.getMessage());
                fwiVar.a(10, null);
            }
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.c = gxo.a(9);
        this.b = new HashMap();
        this.d = eyf.a(guw.a(), (String) eyb.a.c());
    }
}

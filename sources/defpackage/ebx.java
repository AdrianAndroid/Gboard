package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import com.google.android.apps.inputmethod.libs.search.expressiveconcepts.BlocklistManager;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;
import com.google.learning.expander.pod.inferenceapi.core.PredictionResult;
import com.google.learning.expander.pod.inferenceapi.expressiveconcepts.BaseExpressiveConceptsPredictor;
import com.google.learning.expander.pod.inferenceapi.expressiveconcepts.ExpressiveConceptsModelLessPredictor;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: ebx  reason: default package */
/* loaded from: classes.dex */
public final class ebx implements ebv {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionModuleImpl");
    public bxv a;
    private final AtomicReference c = new AtomicReference(null);
    private byd d;
    private Locale e;

    @Override // defpackage.ebz
    public final llp a(String str, int i) {
        llp q;
        llp o;
        llw llwVar;
        lmz lmzVar;
        String lowerCase;
        ebs ebsVar = (ebs) this.c.get();
        if (ebsVar == null) {
            return llp.q();
        }
        if (str.isEmpty() || i <= 0) {
            return llp.q();
        }
        if (ebsVar.c()) {
            Iterator it = ebs.b.i(str).iterator();
            String str2 = (String) (it.hasNext() ? lre.O(it) : null);
            if (!TextUtils.isEmpty(str2)) {
                String b2 = ebsVar.b();
                if (ecd.a.getLanguage().equals(b2)) {
                    lmzVar = ecc.a;
                } else if (ecd.b.getLanguage().equals(b2)) {
                    lmzVar = ecb.a;
                } else {
                    lmzVar = eca.a;
                }
                if (ecd.a.getLanguage().equals(b2)) {
                    lowerCase = str2.toLowerCase(ecd.a);
                } else if (ecd.b.getLanguage().equals(b2)) {
                    lowerCase = str2.toLowerCase(ecd.b);
                } else {
                    lowerCase = str2.toLowerCase(Locale.ENGLISH);
                }
                if (lmzVar.contains(lowerCase)) {
                    ((ltd) ((ltd) ebs.a.b()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionManager", "predict", 246, "ExpressiveConceptsPredictionManager.java")).t("predict(): emotion model not triggered on incomplete sentences.");
                    return llp.q();
                }
            }
            BlocklistManager blocklistManager = ebsVar.g;
            String lowerCase2 = str.toLowerCase(Locale.US);
            llp llpVar = (llp) blocklistManager.e.get();
            if (llpVar == null) {
                llpVar = llp.o(BlocklistManager.c.k(((String) BlocklistManager.a.c()).toLowerCase(Locale.US)));
                blocklistManager.e.set(llpVar);
            }
            int size = llpVar.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    int i3 = i2 + 1;
                    if (lowerCase2.contains((String) llpVar.get(i2))) {
                        break;
                    }
                    i2 = i3;
                } else if (!BlocklistManager.nativeLoadExpressiveConceptModelBlocklistIfNeeded(blocklistManager.f) || !BlocklistManager.nativeContainsBlocklistTerm(str)) {
                    ((ltd) ((ltd) ebs.a.b()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionManager", "predict", 254, "ExpressiveConceptsPredictionManager.java")).t("predict(): Fetching candidates from emotion model");
                    SystemClock.elapsedRealtime();
                    synchronized (ebsVar.h) {
                        ebu ebuVar = ebsVar.i;
                        if (ebuVar != null) {
                            ebt ebtVar = ebuVar.e;
                            if (str.equals(ebtVar.b)) {
                                q = ebtVar.c;
                            } else {
                                try {
                                    BaseExpressiveConceptsPredictor baseExpressiveConceptsPredictor = ebuVar.b;
                                    ebuVar.e = ebt.a(str, llp.o(baseExpressiveConceptsPredictor.predictJni(baseExpressiveConceptsPredictor.a, str)));
                                    q = ebuVar.e.c;
                                } catch (RuntimeException e) {
                                    ((ltd) ((ltd) ((ltd) ebu.a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionModel", "predict", 'J', "ExpressiveConceptsPredictionModel.java")).t("Predictor is active but failed to make predictions");
                                    q = llp.q();
                                }
                            }
                        } else {
                            q = llp.q();
                        }
                    }
                    float floatValue = ((Double) ebs.e.c()).floatValue();
                    ArrayList arrayList = new ArrayList(q);
                    Collections.sort(arrayList, ebs.c);
                    if (!((Boolean) ebs.d.c()).booleanValue() || arrayList.isEmpty() || !((String) ((PredictionResult) arrayList.get(0)).a).equals("neutral")) {
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = arrayList.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            PredictionResult predictionResult = (PredictionResult) arrayList.get(i4);
                            if (predictionResult.b < floatValue || arrayList2.size() >= i) {
                                break;
                            }
                            if (!((String) predictionResult.a).equals("neutral")) {
                                String str3 = (String) predictionResult.a;
                                String b3 = ebsVar.b();
                                if (ecd.a.getLanguage().equals(b3)) {
                                    llwVar = ecc.b;
                                } else if (ecd.b.getLanguage().equals(b3)) {
                                    llwVar = ecb.b;
                                } else {
                                    llwVar = eca.b;
                                }
                                String str4 = (String) llwVar.get(str3);
                                if (str4 == null) {
                                    str4 = str3.replace('_', ' ');
                                }
                                arrayList2.add(new ece(str4, Float.valueOf(predictionResult.b)));
                            }
                        }
                        o = llp.o(arrayList2);
                    } else {
                        o = llp.q();
                    }
                    SystemClock.elapsedRealtime();
                    return o;
                }
            }
            ((ltd) ((ltd) ebs.a.b()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionManager", "predict", 250, "ExpressiveConceptsPredictionManager.java")).t("predict(): emotion model not triggered on blocklist words.");
            return llp.q();
        }
        ((ltd) ((ltd) ebs.a.d()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionManager", "predict", 242, "ExpressiveConceptsPredictionManager.java")).t("predict(): emotion model not initialized");
        return llp.q();
    }

    @Override // defpackage.ebz
    public final boolean c() {
        ebs ebsVar = (ebs) this.c.get();
        return ebsVar != null && ebsVar.c();
    }

    public final void d(bxv bxvVar) {
        boolean z;
        ebu ebuVar;
        bxu a = bxvVar.a(this.e);
        if (!a.b()) {
            ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionModuleImpl", "setupPredictorIfNeeded", 62, "ExpressiveConceptsPredictionModuleImpl.java")).t("Model files package is invalid");
            return;
        }
        ebs ebsVar = (ebs) this.c.get();
        if (ebsVar == null) {
            return;
        }
        File file = new File(a.b);
        int i = a.d;
        Locale locale = this.e;
        synchronized (ebsVar.h) {
            ebu ebuVar2 = ebsVar.i;
            z = false;
            if (ebuVar2 != null && i == ebuVar2.c && locale.equals(ebuVar2.d)) {
                z = true;
            }
        }
        if (z) {
            ((ltd) ((ltd) ebs.a.b()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionManager", "setUpPredictor", 138, "ExpressiveConceptsPredictionManager.java")).z("Predictor already exists: version %s locale %s", i, locale);
        } else {
            try {
                BaseExpressiveConceptsPredictor b2 = ExpressiveConceptsModelLessPredictor.b(file);
                if (b2 != null) {
                    ebu ebuVar3 = new ebu(b2, i, locale);
                    synchronized (ebsVar.h) {
                        ebuVar = ebsVar.i;
                        if (ebuVar == null) {
                            ebuVar = null;
                        }
                        ebsVar.i = ebuVar3;
                    }
                    if (ebuVar != null) {
                        mks mksVar = ebsVar.f;
                        Objects.requireNonNull(ebuVar);
                        mksVar.execute(new eas(ebuVar, 5));
                    }
                } else {
                    ((ltd) ((ltd) ebs.a.d()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionManager", "setUpPredictor", 149, "ExpressiveConceptsPredictionManager.java")).z("Failed to create predictor: version %s locale %s", i, locale);
                }
            } catch (RuntimeException e) {
                ((ltd) ((ltd) ((ltd) ebs.a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionManager", "setUpPredictor", 152, "ExpressiveConceptsPredictionManager.java")).z("Failed to create predictor: version %s locale %s", i, locale);
            }
        }
        String str = a.c;
        ebsVar.g.f = str;
        ((ltd) ((ltd) BlocklistManager.b.b()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/BlocklistManager", "loadFileBasedBlocklist", 65, "BlocklistManager.java")).G("Blocklist is loaded with %s, load result is %s", str, String.valueOf(BlocklistManager.nativeLoadExpressiveConceptModelBlocklistIfNeeded(str)));
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionModuleImpl", "setupPredictorIfNeeded", 73, "ExpressiveConceptsPredictionModuleImpl.java")).t("Prediction manager has been set up.");
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("lastSyncLocale = ".concat(String.valueOf(String.valueOf(this.e))));
        boolean c = c();
        printer.println("isActive = " + c);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ExpressiveConceptsPredictionModuleImpl";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        ltg ltgVar = b;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionModuleImpl", "onCreate", 34, "ExpressiveConceptsPredictionModuleImpl.java")).t("onCreate()");
        if (!NativeLibHelper.a("expressive_concepts", false)) {
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionModuleImpl", "onCreate", 36, "ExpressiveConceptsPredictionModuleImpl.java")).t("Failed to load module 'expressive_concepts'.");
        } else if (!NativeLibHelper.a("expressive_concepts_blocklist", false)) {
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionModuleImpl", "onCreate", 40, "ExpressiveConceptsPredictionModuleImpl.java")).t("Failed to load module 'expressive_concepts_blocklist'.");
        } else {
            bxv bxvVar = bxv.a;
            if (bxvVar == null) {
                synchronized (bxv.class) {
                    bxvVar = bxv.a;
                    if (bxvVar == null) {
                        bxvVar = new bxv(bzd.a(context), gxo.a(10));
                        bxv.a = bxvVar;
                    }
                }
            }
            this.a = bxvVar;
            this.c.set(new ebs());
            this.e = hqp.e();
            byd bydVar = new byd() { // from class: ebw
                @Override // defpackage.byd
                public final void b() {
                    ebx ebxVar = ebx.this;
                    ebxVar.d(ebxVar.a);
                }
            };
            this.d = bydVar;
            this.a.n(bydVar);
            if (this.a.a(this.e).b()) {
                d(this.a);
                return;
            }
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionModuleImpl", "onCreate", 53, "ExpressiveConceptsPredictionModuleImpl.java")).t("Syncing expressive concept model.");
            this.a.l();
        }
    }

    @Override // defpackage.ifw
    public final void gn() {
        byd bydVar;
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionModuleImpl", "onDestroy", 78, "ExpressiveConceptsPredictionModuleImpl.java")).t("onDestroy()");
        bxv bxvVar = this.a;
        if (bxvVar != null && (bydVar = this.d) != null) {
            bxvVar.p(bydVar);
        }
        ebs ebsVar = (ebs) this.c.getAndSet(null);
        if (ebsVar != null) {
            ebsVar.close();
        }
    }
}

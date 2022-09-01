package defpackage;

import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.inputmethod.latin.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: cah  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cah implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ cah(boq boqVar, WeakReference weakReference, boolean z, int i) {
        this.d = i;
        this.b = boqVar;
        this.c = weakReference;
        this.a = z;
    }

    public /* synthetic */ cah(caj cajVar, boolean z, opu opuVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.d = i;
        this.b = cajVar;
        this.a = z;
        this.c = opuVar;
    }

    public /* synthetic */ cah(cou couVar, coq coqVar, boolean z, int i) {
        this.d = i;
        this.c = couVar;
        this.b = coqVar;
        this.a = z;
    }

    public /* synthetic */ cah(idz idzVar, String str, boolean z, int i) {
        this.d = i;
        this.b = idzVar;
        this.c = str;
        this.a = z;
    }

    public cah(obf obfVar, nzf nzfVar, boolean z, int i) {
        this.d = i;
        this.c = obfVar;
        this.b = nzfVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fls flsVar;
        int i = this.d;
        if (i == 0) {
            Object obj = this.b;
            boolean z = this.a;
            Object obj2 = this.c;
            synchronized (((caj) obj).b) {
                if (!z) {
                    if (((caj) obj).n) {
                        ((caj) obj).f.e(cap.MAIN_LM_ERRORS, mvc.CLIENT_LOAD_MAIN_LM_FAILED_AGAIN);
                    }
                    ((caj) obj).n = false;
                    ((caj) obj).o.clear();
                } else if (!((caj) obj).n) {
                } else {
                    ((caj) obj).f.e(cap.MAIN_LM_ERRORS, mvc.CLIENT_LOAD_MAIN_LM_FAILED_ONCE);
                    cby cbyVar = ((caj) obj).g;
                    List list = ((caj) obj).o;
                    ((ltd) ((ltd) cby.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/LmManager", "deleteLanguageModel", 117, "LmManager.java")).w("deleteLanguageModel(): %s", list);
                    cfd cfdVar = cbyVar.b;
                    if (!cfdVar.l.get()) {
                        ((luc) ((luc) cfd.h.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "deleteLanguageModelPacks", 854, "SuperDelightManager.java")).t("SuperDelight#deleteLanguageModelPacks(): not registered");
                        List list2 = (List) cfdVar.n.get();
                        list2.add(new cfc(list, cfdVar));
                        cfdVar.n.set(list2);
                    } else {
                        cfdVar.j(list);
                    }
                    ((caj) obj).n = false;
                    ArrayList arrayList = new ArrayList(((caj) obj).o);
                    ((caj) obj).o.clear();
                    Delight5Facilitator delight5Facilitator = (Delight5Facilitator) ((opu) obj2).a;
                    Delight5Facilitator.v(delight5Facilitator.j(delight5Facilitator.k(arrayList, false, false)), "Delight5ReloadLanguageModels-initializeDecoderWhenDone");
                }
            }
        } else if (i == 1) {
            Object obj3 = this.b;
            Object obj4 = this.c;
            boolean z2 = this.a;
            boq boqVar = (boq) ((WeakReference) obj4).get();
            if (boqVar == null) {
                return;
            }
            boq boqVar2 = (boq) obj3;
            ino inoVar = boqVar2.v;
            ieh.j();
            if (z2) {
                inoVar.t(R.string.f162110_resource_name_obfuscated_res_0x7f1406f4, System.currentTimeMillis());
                int n = inoVar.n(R.string.f160300_resource_name_obfuscated_res_0x7f14063b, 0);
                inoVar.s(R.string.f162130_resource_name_obfuscated_res_0x7f1406f6, n);
                if (n > 0 && n <= 3) {
                    ieh.j().e(dda.NATIVE_LANGUAGE_HINT_SEARCH_USER_EVENTS, Integer.valueOf(dfl.a[n - 1]));
                }
            } else {
                inoVar.t(R.string.f162090_resource_name_obfuscated_res_0x7f1406f2, System.currentTimeMillis());
                int n2 = inoVar.n(R.string.f160290_resource_name_obfuscated_res_0x7f14063a, 0);
                inoVar.s(R.string.f162170_resource_name_obfuscated_res_0x7f1406fa, n2);
                if (n2 > 0 && n2 <= 3) {
                    ieh.j().e(dda.NATIVE_LANGUAGE_HINT_USER_EVENTS, Integer.valueOf(dfl.a[n2 - 1]));
                }
            }
            boqVar.i(boqVar2.f.a);
        } else if (i == 2) {
            Object obj5 = this.c;
            Object obj6 = this.b;
            boolean z3 = this.a;
            cot cotVar = ((cou) obj5).a;
            if (cotVar == null) {
                return;
            }
            cotVar.a(((coq) obj6).e, z3);
        } else if (i != 3) {
            ((obf) this.c).k.c(this.b, this.a);
        } else {
            Object obj7 = this.b;
            Object obj8 = this.c;
            boolean z4 = this.a;
            fma fmaVar = ((idz) obj7).e;
            fmaVar.g.writeLock().lock();
            try {
                flq flqVar = (flq) fmaVar.k.get(obj8);
                if (flqVar == null) {
                    fmaVar.g.writeLock().lock();
                    flsVar = new fls(fmaVar, (String) obj8);
                    fmaVar.k.put(obj8, flsVar);
                    fmaVar.g.writeLock().unlock();
                } else {
                    try {
                        fls flsVar2 = (fls) flqVar;
                        fmaVar.g.writeLock().unlock();
                        flsVar = flsVar2;
                    } catch (ClassCastException e) {
                        throw new IllegalArgumentException("another type of counter exists with name: " + ((String) obj8), e);
                    }
                }
                flsVar.a(true != z4 ? 0L : 1L, fma.d);
            } finally {
                fmaVar.g.writeLock().unlock();
            }
        }
    }
}

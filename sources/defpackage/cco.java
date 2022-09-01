package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cco  reason: default package */
/* loaded from: classes.dex */
public final class cco implements mix {
    private static final lug a = lug.i("Delight5Facilitator");
    private final Delight5Facilitator b;
    private final Context c;
    private final List d;
    private final ino e;
    private final idk f;

    private cco(Context context, List list, ino inoVar, Delight5Facilitator delight5Facilitator, idk idkVar) {
        this.c = context;
        this.d = list;
        this.e = inoVar;
        this.b = delight5Facilitator;
        this.f = idkVar;
    }

    public static cco b(Context context, List list, ino inoVar, Delight5Facilitator delight5Facilitator) {
        return new cco(context, list, inoVar, delight5Facilitator, ieh.j());
    }

    private final mko c(mvm mvmVar) {
        if (!this.b.D(mvmVar, mvk.UNUSED)) {
            return mkk.a;
        }
        this.b.B(mvmVar, mvk.DECODING);
        return this.b.h.b(mvmVar);
    }

    @Override // defpackage.mix
    public final mko a() {
        String join;
        ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/UserHistoryLanguageModelLoader", "call", 82, "UserHistoryLanguageModelLoader.java")).t("Running user history language model loader");
        bzw.c(this.c);
        Context context = this.c;
        synchronized (cfm.c) {
            File f = cfm.a.f(context, false);
            if (f.exists() && f.isDirectory()) {
                File[] listFiles = f.listFiles();
                if (listFiles != null && (r5 = listFiles.length) != 0) {
                    File g = cfm.a.g(context);
                    for (File file : listFiles) {
                        File file2 = new File(g, file.getName());
                        if (!file2.exists() || cfm.b.e(file2)) {
                            cfm.b.j(file, file2);
                        }
                    }
                }
                cfm.b.e(f);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (mvm mvmVar : this.b.r()) {
            mvl mvlVar = mvl.USER_HISTORY;
            mvl b = mvl.b(mvmVar.b);
            if (b == null) {
                b = mvl.UNKNOWN;
            }
            if (mvlVar == b) {
                arrayList.add(this.b.h.d(mvmVar));
                this.b.B(mvmVar, mvk.UNUSED);
                this.b.A(mvmVar, false);
            }
        }
        boolean ak = this.e.ak("pref_key_use_personalized_dicts");
        boolean z = !irs.d();
        if (!ak || z) {
            if (!ak) {
                ieh.j().e(cap.UNLOAD_USER_HISTORY_LM, 1);
            } else {
                ieh.j().e(cap.UNLOAD_USER_HISTORY_LM, 2);
            }
            ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/UserHistoryLanguageModelLoader", "call", 117, "UserHistoryLanguageModelLoader.java")).I("User history language model is unloaded: enablePersonalization=%s, deviceLocked=%s", ak, z);
            return hiz.K(arrayList).f();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Locale locale : this.d) {
            mvm f2 = cfm.f(this.c, locale, this.e.y(R.string.f160340_resource_name_obfuscated_res_0x7f14063f), 159107666);
            this.b.A(f2, true);
            nfh t = mcl.e.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mcl mclVar = (mcl) t.b;
            mclVar.b = 2;
            mclVar.a |= 1;
            String locale2 = locale.toString();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mcl mclVar2 = (mcl) t.b;
            locale2.getClass();
            mclVar2.a |= 4;
            mclVar2.d = locale2;
            long a2 = cbw.a(f2);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mcl mclVar3 = (mcl) t.b;
            mclVar3.a |= 2;
            mclVar3.c = a2;
            arrayList2.add((mcl) t.cz());
            arrayList.add(c(f2));
        }
        if (((Boolean) cas.y.c()).booleanValue() && this.d.size() > 1) {
            Context context2 = this.c;
            List list = this.d;
            String y = this.e.y(R.string.f160340_resource_name_obfuscated_res_0x7f14063f);
            if (list.size() == 1) {
                join = String.valueOf(list.get(0));
            } else {
                ArrayList B = lre.B(list);
                Collections.sort(B, xr.e);
                join = TextUtils.join("-", B);
            }
            mvm f3 = cbw.f(mvl.USER_HISTORY, cfm.a(context2, join, y), list);
            nfh nfhVar = (nfh) f3.N(5);
            nfhVar.cG(f3);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mvm mvmVar2 = (mvm) nfhVar.b;
            mvm mvmVar3 = mvm.l;
            mvmVar2.k = 159107666;
            mvmVar2.a |= 512;
            mvm mvmVar4 = (mvm) nfhVar.cz();
            this.b.A(mvmVar4, true);
            arrayList.add(c(mvmVar4));
        }
        this.f.e(cap.LANGUAGE_MODEL_LOAD_INFO, arrayList2);
        return hiz.K(arrayList).f();
    }
}

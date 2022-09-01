package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: ccf  reason: default package */
/* loaded from: classes.dex */
public final class ccf implements mix {
    private static final lug a = lug.i("Delight5Facilitator");
    private final Delight5Facilitator b;
    private final dyt c;

    public ccf(Context context, Delight5Facilitator delight5Facilitator) {
        this.b = delight5Facilitator;
        dyt dytVar = dyt.f;
        if (dytVar == null) {
            synchronized (dyt.class) {
                dytVar = dyt.f;
                if (dytVar == null) {
                    dytVar = new dyt(bzd.a(context.getApplicationContext()), gxo.a(19));
                    hhq.p(dytVar, dyt.e);
                    dyt.f = dytVar;
                }
            }
        }
        this.c = dytVar;
    }

    @Override // defpackage.mix
    public final mko a() {
        File file;
        ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/RankingModelLoader", "call", 28, "RankingModelLoader.java")).t("Running Ranking Model loader");
        ArrayList arrayList = new ArrayList();
        if (((Boolean) cas.x.c()).booleanValue()) {
            dyt dytVar = this.c;
            byy byyVar = (byy) dytVar.h.get();
            String str = null;
            if (!byyVar.i()) {
                Iterator it = byyVar.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        file = null;
                        break;
                    }
                    String str2 = (String) it.next();
                    if (str2.contains("gesture")) {
                        file = byyVar.f(str2);
                        break;
                    }
                }
                if (file != null) {
                    if (!file.isDirectory()) {
                        str = file.getPath();
                    } else {
                        File[] listFiles = file.listFiles();
                        if (listFiles != null) {
                            int length = listFiles.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                String path = listFiles[i].getPath();
                                if (path.endsWith(".tflite")) {
                                    str = path;
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            } else {
                dytVar.b();
            }
            if (str != null) {
                arrayList.add(this.b.h.b(cbw.d(mvl.GESTURE_RANKING, str, this.b.q())));
            }
        }
        return hiz.K(arrayList).f();
    }
}

package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.io.File;

/* compiled from: PG */
/* renamed from: cfl  reason: default package */
/* loaded from: classes.dex */
public final class cfl implements juh {
    public static final lug a = lug.i("SuperDelight");
    private final Context b;
    private final jan c;
    private final idk d;
    private final kcq e;

    public cfl(Context context, jan janVar, mkr mkrVar, idk idkVar) {
        this.b = context;
        this.d = idkVar;
        this.c = janVar;
        this.e = kcq.g(mkrVar);
    }

    @Override // defpackage.juh
    public final mko a(juc jucVar, String str, File file, File file2) {
        return this.e.e(jucVar.o(), new cfk(Delight5Facilitator.h(this.b).h, this.c, file, file2, this.d));
    }

    @Override // defpackage.jrs
    public final mko b(jsr jsrVar) {
        return this.e.d(jsrVar);
    }

    @Override // defpackage.juh
    public final boolean c(String str) {
        return TextUtils.equals(str, "fst-decompress");
    }

    @Override // defpackage.jsj
    public final String d() {
        return "SuperDelightUnpacker";
    }
}

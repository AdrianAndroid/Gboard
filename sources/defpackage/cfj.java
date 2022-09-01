package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.io.File;

/* compiled from: PG */
/* renamed from: cfj  reason: default package */
/* loaded from: classes.dex */
public final class cfj implements jty {
    public static final lug a = lug.i("SuperDelight");
    private final Context b;
    private final jan c;
    private final idk d;
    private final kcq e;

    public cfj(Context context, jan janVar, mkr mkrVar, idk idkVar) {
        this.b = context.getApplicationContext();
        this.c = janVar;
        this.e = kcq.g(mkrVar);
        this.d = idkVar;
    }

    @Override // defpackage.jty
    public final jtv a(juc jucVar) {
        Context context = this.b;
        jtr e = jucVar.e();
        if (e != null && jqx.l(jucVar)) {
            if (TextUtils.equals(e.b(), "bundled_delight") || (TextUtils.equals(e.b(), "delight") && e.a() == context.getResources().getInteger(R.integer.f131170_resource_name_obfuscated_res_0x7f0c001c))) {
                return jtv.b(jucVar);
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.jrs
    public final mko b(jsr jsrVar) {
        return this.e.d(jsrVar);
    }

    @Override // defpackage.jty
    public final mko c(juc jucVar, jtw jtwVar, File file) {
        return this.e.e(jucVar.o(), new cfi(this.b, jucVar, this.c, file, this.d));
    }

    @Override // defpackage.jsj
    public final String d() {
        return "SuperDelightResourceMetadataFetcher";
    }

    public final String toString() {
        return "SuperDelightResourceMetadataFetcher";
    }
}

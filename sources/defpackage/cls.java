package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.io.File;

/* compiled from: PG */
/* renamed from: cls  reason: default package */
/* loaded from: classes.dex */
public final class cls implements jty {
    private final Context a;
    private final jan b;
    private final /* synthetic */ int c;
    private final kcq d;

    public cls(Context context, jan janVar, mkr mkrVar, int i, byte[] bArr) {
        this.c = i;
        this.a = context;
        this.b = janVar;
        this.d = kcq.g(mkrVar);
    }

    @Override // defpackage.jsj
    public final String d() {
        return this.c != 0 ? "BundledEmojiDataFetcher" : "BundledEmojiMetadataFetcher";
    }

    public cls(Context context, jan janVar, mkr mkrVar, int i) {
        this.c = i;
        this.a = context;
        this.b = janVar;
        this.d = kcq.g(mkrVar);
    }

    @Override // defpackage.jrs
    public final mko b(jsr jsrVar) {
        return this.c != 0 ? this.d.d(jsrVar) : this.d.d(jsrVar);
    }

    @Override // defpackage.jty
    public final mko c(juc jucVar, jtw jtwVar, File file) {
        if (this.c == 0) {
            return this.d.e(jucVar.o(), new clz(this.a, this.b, "emoji_superpacks_manifest_bundled.zip", file));
        }
        return this.d.e(jucVar.o(), new clz(this.a, this.b, "emoji_search_en_us.zip", file));
    }

    @Override // defpackage.jty
    public final jtv a(juc jucVar) {
        if (this.c == 0) {
            jtr e = jucVar.e();
            if (e != null && TextUtils.equals(e.b(), "bundled_emoji") && jqx.l(jucVar)) {
                return jtv.b(jucVar);
            }
            return null;
        }
        Context context = this.a;
        if (!TextUtils.equals(jucVar.j(), "bundled_emoji")) {
            return null;
        }
        String b = cxq.b(jucVar);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        for (String str : context.getResources().getStringArray(R.array.f1070_resource_name_obfuscated_res_0x7f030005)) {
            if (TextUtils.equals(b, str)) {
                return jtv.b(jucVar);
            }
        }
        return null;
    }
}

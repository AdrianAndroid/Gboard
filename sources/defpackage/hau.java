package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: hau  reason: default package */
/* loaded from: classes.dex */
public final class hau implements hbe {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantDataProvider");
    public static final llp b;
    public static final llp c;
    private static volatile hau g;
    public final AtomicReference d = new AtomicReference(lkq.a);
    public final AtomicReference e = new AtomicReference(lkq.a);
    public hiz f;
    private hiz h;
    private final Executor i;

    static {
        Integer valueOf = Integer.valueOf((int) R.raw.f147280_resource_name_obfuscated_res_0x7f130046);
        b = llp.s(valueOf, Integer.valueOf((int) R.raw.f147330_resource_name_obfuscated_res_0x7f13004b));
        c = llp.s(valueOf, Integer.valueOf((int) R.raw.f147320_resource_name_obfuscated_res_0x7f13004a));
    }

    private hau(Executor executor) {
        this.i = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hau c(Context context) {
        hau hauVar = g;
        if (hauVar == null) {
            synchronized (hau.class) {
                hauVar = g;
                if (hauVar == null) {
                    hau hauVar2 = new hau(gxo.a(9));
                    hiz p = hiz.p(new evl(context, 12), hauVar2.i);
                    hauVar2.h = p;
                    hauVar2.f = p.u(new ebi(hauVar2, 20), hauVar2.i);
                    g = hauVar2;
                    hauVar = hauVar2;
                }
            }
        }
        return hauVar;
    }

    @Override // defpackage.hbe
    public final llp a(String str) {
        if (!this.f.D()) {
            return llp.q();
        }
        llp a2 = ((llr) this.d.get()).a(b(str));
        return a2 != null ? a2 : llp.q();
    }

    @Override // defpackage.hbe
    public final String b(String str) {
        String str2;
        return (this.f.D() && (str2 = (String) lre.ap(((llr) this.e.get()).a(str))) != null) ? str2 : str;
    }
}

package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.google.android.inputmethod.latin.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: gup  reason: default package */
/* loaded from: classes.dex */
public final class gup extends Enum implements gud {
    public static final gup a;
    private static final /* synthetic */ gup[] b;

    static {
        gup gupVar = new gup();
        a = gupVar;
        b = new gup[]{gupVar};
    }

    private gup() {
    }

    public static gup[] values() {
        return (gup[]) b.clone();
    }

    @Override // defpackage.gud
    public final void a(Context context, String str) {
        b(context, str, true != gul.a() ? 0 : R.style.f203150_resource_name_obfuscated_res_0x7f1507d6);
    }

    @Override // defpackage.gud
    public final void b(Context context, String str, int i) {
        if (!gwc.i(context)) {
            context = hqs.d(context);
        }
        new guo(new ContextThemeWrapper(context, (int) R.style.f192500_resource_name_obfuscated_res_0x7f150243), i).f(str);
    }
}

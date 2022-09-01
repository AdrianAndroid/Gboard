package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: eau  reason: default package */
/* loaded from: classes.dex */
public final class eau implements hho, inm {
    public static final /* synthetic */ int h = 0;
    public final Context c;
    public final Set d;
    public final llp e = ean.f;
    public Runnable f;
    public dbr g;
    private final hso j;
    private static final ltg i = ltg.j("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiExtensionHelper");
    static final hhl a = hhq.a("emoji_keyboard_prewarm_enabled", false);
    static boolean b = false;

    public eau(Context context, llp llpVar, hso hsoVar) {
        qq qqVar = new qq();
        this.d = qqVar;
        this.c = context;
        qqVar.addAll(llpVar);
        this.j = hsoVar;
    }

    private final void e() {
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final int c() {
        return cuz.a.i(iin.m(this.j)) ? R.xml.f210120_resource_name_obfuscated_res_0x7f170107 : R.xml.f210110_resource_name_obfuscated_res_0x7f170106;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return this.g == null;
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ltd) ((ltd) i.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiExtensionHelper", "flagsUpdated", 148, "EmojiExtensionHelper.java")).w("Received flag change: %s.", (hhl) it.next());
        }
        e();
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        e();
    }
}

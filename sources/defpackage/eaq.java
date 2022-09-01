package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiSearchExtension;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eaq  reason: default package */
/* loaded from: classes.dex */
public final class eaq implements cot {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/emoji/search/EmojiHeaderControllerCallback");
    private final Context b;
    private final hsz c;
    private final lgb d;

    public eaq(Context context, hsz hszVar, lgb lgbVar) {
        this.b = context;
        this.c = hszVar;
        this.d = lgbVar;
    }

    @Override // defpackage.cot
    public final void a(cok cokVar, boolean z) {
        int i = cokVar.a;
        switch (i) {
            case -10004:
                if (z) {
                    this.c.z(hfd.d(new iay(-10041, null, cokVar.b)));
                    return;
                } else {
                    ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/search/EmojiHeaderControllerCallback", "onClick", 80, "EmojiHeaderControllerCallback.java")).w("onClick() : User selected same category %s.", cokVar.b);
                    return;
                }
            case -10003:
                this.c.z(hfd.d(new iay(-10059, null, llw.n("extension_interface", IEmojiSearchExtension.class, "activation_source", hfl.INTERNAL, "query", this.d.a()))));
                return;
            case -10002:
                this.c.z(hfd.d(new iay(-10104, null, new icz(this.b.getString(R.string.f154940_resource_name_obfuscated_res_0x7f1403a1), dip.h(hfl.INTERNAL)))));
                return;
            case -10001:
                this.c.z(hfd.d(new iay(-10102, null, IEmojiSearchExtension.class.getName())));
                return;
            default:
                ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/search/emoji/search/EmojiHeaderControllerCallback", "onClick", 85, "EmojiHeaderControllerCallback.java")).u("onClick() : Unknown event code %d.", i);
                return;
        }
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fbl  reason: default package */
/* loaded from: classes.dex */
public final class fbl {
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeLanguagePickerController");
    public final ViewGroup a;
    public final dxa b;
    private final Context d;

    public fbl(Context context, ViewGroup viewGroup) {
        this.d = context;
        this.a = viewGroup;
        this.b = new dxa(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        ((ltd) ((ltd) c.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeLanguagePickerController", "show", 24, "VoiceImeLanguagePickerController.java")).t("Show language picker");
        View a = this.b.a();
        this.b.d(R.string.f158830_resource_name_obfuscated_res_0x7f14057b);
        this.a.removeAllViews();
        this.a.addView(a);
        this.a.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return dxa.e(this.d);
    }
}

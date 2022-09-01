package defpackage;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: fw  reason: default package */
/* loaded from: classes.dex */
public final class fw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ActionMode a(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static final void c(View view, pa paVar) {
        oll.e(view, "<this>");
        view.setTag(R.id.f130480_resource_name_obfuscated_res_0x7f0b21eb, paVar);
    }
}

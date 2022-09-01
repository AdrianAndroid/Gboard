package defpackage;

import android.view.Menu;
import android.view.Window;
import java.util.List;

/* compiled from: PG */
/* renamed from: fx  reason: default package */
/* loaded from: classes.dex */
public final class fx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Window.Callback callback, List list, Menu menu, int i) {
        callback.onProvideKeyboardShortcuts(list, menu, i);
    }
}

package defpackage;

import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: han  reason: default package */
/* loaded from: classes.dex */
public enum han {
    AGSA("com.google.android.googlequicksearchbox"),
    CHROME("com.android.chrome"),
    DOCS("com.google.android.apps.docs.editors.docs"),
    FB_MESSENGER("com.facebook.orca"),
    GMAIL("com.google.android.gm"),
    GOOGLE_IT("com.google.android.apps.searchlite"),
    KEYBOARD_DEV_UTILS("com.google.android.inputmethod.keyboarddevutils"),
    TELEGRAM_X("org.thunderdog.challegram"),
    WHATSAPP("com.whatsapp"),
    YOUTUBE("com.google.android.youtube"),
    LAUNCHER("com.google.android.apps.nexuslauncher");
    
    public final String l;

    han(String str) {
        this.l = str;
    }

    public final boolean a(EditorInfo editorInfo) {
        if (editorInfo == null) {
            return false;
        }
        return this.l.equals(ham.m(editorInfo));
    }
}

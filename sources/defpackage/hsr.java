package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* renamed from: hsr  reason: default package */
/* loaded from: classes.dex */
public final class hsr {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;

    public final void a(KeyEvent keyEvent) {
        if (!this.a) {
            return;
        }
        if (keyEvent.getKeyCode() == 4 && (keyEvent.getFlags() & 64) == 64) {
            return;
        }
        this.d = true;
    }
}

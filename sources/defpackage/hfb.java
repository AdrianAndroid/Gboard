package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* renamed from: hfb  reason: default package */
/* loaded from: classes.dex */
public class hfb implements hfi {
    private final StringBuilder a = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: protected */
    public static hfd b(iay iayVar, KeyEvent keyEvent) {
        iah iahVar = keyEvent.getAction() == 1 ? iah.UP : iah.PRESS;
        long eventTime = keyEvent.getEventTime();
        hfd e = hfd.e();
        e.h = eventTime;
        e.a = iahVar;
        e.j(iayVar);
        e.g = keyEvent.getMetaState();
        e.j = keyEvent.getRepeatCount();
        e.o = keyEvent.getDeviceId();
        e.p = 6;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static hfd c(iax iaxVar, String str, KeyEvent keyEvent) {
        return b(new iay(keyEvent.getKeyCode(), iaxVar, str), keyEvent);
    }

    @Override // defpackage.hfi
    public hfd a(KeyEvent keyEvent) {
        int a = iaz.a(keyEvent);
        iax iaxVar = null;
        if ((Integer.MIN_VALUE & a) != 0) {
            return null;
        }
        this.a.setLength(0);
        String sb = a != 0 ? this.a.appendCodePoint(a).toString() : null;
        if (sb != null) {
            iaxVar = iax.DECODE;
        }
        return c(iaxVar, sb, keyEvent);
    }
}

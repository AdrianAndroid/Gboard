package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: pn  reason: default package */
/* loaded from: classes2.dex */
public final class pn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context a(po poVar, Configuration configuration) {
        return poVar.createConfigurationContext(configuration);
    }

    public static boolean b(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}

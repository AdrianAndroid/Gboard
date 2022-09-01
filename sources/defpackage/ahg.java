package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: PG */
/* renamed from: ahg  reason: default package */
/* loaded from: classes.dex */
final class ahg {
    final IntentFilter a;
    final BroadcastReceiver b;
    boolean c;
    boolean d;

    public ahg(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.a = intentFilter;
        this.b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.b);
        sb.append(" filter=");
        sb.append(this.a);
        if (this.d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}

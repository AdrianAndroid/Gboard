package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ahf  reason: default package */
/* loaded from: classes.dex */
final class ahf extends Handler {
    final /* synthetic */ ahh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahf(ahh ahhVar, Looper looper) {
        super(looper);
        this.a = ahhVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        azp[] azpVarArr;
        if (message.what == 1) {
            ahh ahhVar = this.a;
            while (true) {
                synchronized (ahhVar.b) {
                    size = ahhVar.c.size();
                    if (size <= 0) {
                        return;
                    }
                    azpVarArr = new azp[size];
                    ahhVar.c.toArray(azpVarArr);
                    ahhVar.c.clear();
                }
                for (int i = 0; i < size; i++) {
                    azp azpVar = azpVarArr[i];
                    int size2 = ((ArrayList) azpVar.a).size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ahg ahgVar = (ahg) ((ArrayList) azpVar.a).get(i2);
                        if (!ahgVar.d) {
                            ahgVar.b.onReceive(ahhVar.a, (Intent) azpVar.b);
                        }
                    }
                }
            }
        } else {
            super.handleMessage(message);
        }
    }
}

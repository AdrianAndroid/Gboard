package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* renamed from: foz  reason: default package */
/* loaded from: classes.dex */
public final class foz extends gco {
    public foz() {
        super(Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            fgy fgyVar = (fgy) pair.first;
            foi foiVar = (foi) pair.second;
            try {
                throw null;
            } catch (RuntimeException e) {
                BasePendingResult.j(foiVar);
                throw e;
            }
        } else if (i == 2) {
            ((BasePendingResult) message.obj).i(Status.d);
        } else {
            int i2 = message.what;
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + i2, new Exception());
        }
    }

    public foz(Looper looper) {
        super(looper);
    }
}

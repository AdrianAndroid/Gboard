package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl;

/* compiled from: PG */
/* renamed from: fyv  reason: default package */
/* loaded from: classes.dex */
public final class fyv extends BroadcastReceiver {
    final /* synthetic */ InAppTrainingServiceImpl a;

    public fyv(InAppTrainingServiceImpl inAppTrainingServiceImpl) {
        this.a = inAppTrainingServiceImpl;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            InAppTrainingServiceImpl inAppTrainingServiceImpl = this.a;
            inAppTrainingServiceImpl.g.e(job.BACKGROUND_TRAINING_INTERRUPT_NOT_IDLE);
            inAppTrainingServiceImpl.f();
        }
    }
}

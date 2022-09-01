package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LifeboatReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!intent.hasExtra("MetricSnapshot") || !intent.hasExtra("Transmitters")) {
            return;
        }
        try {
            kig kigVar = (kig) nfm.z(kig.c, (byte[]) jdg.u(intent.getByteArrayExtra("MetricSnapshot")), nfb.b());
            BroadcastReceiver.PendingResult goAsync = goAsync();
            String[] strArr = (String[]) jdg.u(intent.getStringArrayExtra("Transmitters"));
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                try {
                    Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    arrayList.add(((kih) declaredConstructor.newInstance(new Object[0])).a(context, kigVar));
                } catch (Throwable th) {
                    Log.e("PrimesLifeboatReceiver", String.format("Unable to transmit the crash using %s.", str), th);
                }
            }
            mko Q = kcu.Q(arrayList);
            Objects.requireNonNull(goAsync);
            Q.d(new joq(goAsync, 5), mjl.a);
        } catch (ngd e) {
            Log.e("PrimesLifeboatReceiver", "Unable to parse the payload of MetricSnapshot.", e);
        }
    }
}

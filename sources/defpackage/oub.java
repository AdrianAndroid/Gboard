package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: oub  reason: default package */
/* loaded from: classes2.dex */
final class oub extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(oul.b);
        return simpleDateFormat;
    }
}

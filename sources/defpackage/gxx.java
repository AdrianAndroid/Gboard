package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: gxx  reason: default package */
/* loaded from: classes.dex */
public class gxx {
    private final long a;
    final String b;
    private final int c;

    public gxx(String str, int i, long j) {
        this.b = str;
        this.c = i;
        this.a = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(lfa lfaVar) {
        lfaVar.a(this.b);
        lfaVar.a(new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US).format(new Date(this.a)));
        lfaVar.f("queueSize", this.c);
    }
}

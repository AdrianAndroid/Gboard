package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: nxy  reason: default package */
/* loaded from: classes2.dex */
public final class nxy {
    public static final Logger a = Logger.getLogger(nxy.class.getName());
    public final String b = "keepalive time nanos";
    public final AtomicLong c;

    public nxy() {
        AtomicLong atomicLong = new AtomicLong();
        this.c = atomicLong;
        jdg.w(true, "value must be positive");
        atomicLong.set(Long.MAX_VALUE);
    }
}

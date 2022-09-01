package defpackage;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: oaa  reason: default package */
/* loaded from: classes2.dex */
public final class oaa extends nux {
    public static final Logger a;
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
    static final boolean c;
    static final boolean d;
    protected static final boolean e;
    public static final nzz f;
    private static final String s;
    private static final String t;
    private static final String u;
    private static String v;
    private final boolean A;
    private nuu B;
    final nvi g;
    public final Random h = new Random();
    protected volatile nzu i = nzw.a;
    public final AtomicReference j = new AtomicReference();
    public final String k;
    public final int l;
    public final long m;
    public final nvz n;
    public final lga o;
    public boolean p;
    public final nuw q;
    public boolean r;
    private final String w;
    private final ofd x;
    private boolean y;
    private Executor z;

    static {
        Logger logger = Logger.getLogger(oaa.class.getName());
        a = logger;
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        s = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        t = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        u = property3;
        c = Boolean.parseBoolean(property);
        d = Boolean.parseBoolean(property2);
        e = Boolean.parseBoolean(property3);
        nzz nzzVar = null;
        try {
            try {
                try {
                    nzz nzzVar2 = (nzz) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, oaa.class.getClassLoader()).asSubclass(nzz.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (nzzVar2.b() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", nzzVar2.b());
                    } else {
                        nzzVar = nzzVar2;
                    }
                } catch (Exception e2) {
                    a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassCastException e4) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
        f = nzzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public oaa(String str, nur nurVar, ofd ofdVar, lga lgaVar, boolean z) {
        jdg.Q(nurVar, "args");
        this.x = ofdVar;
        jdg.Q(str, "name");
        URI create = URI.create("//".concat(str));
        boolean z2 = true;
        jdg.A(create.getHost() != null, "Invalid DNS name: %s", str);
        String authority = create.getAuthority();
        jdg.O(authority, "nameUri (%s) doesn't have an authority", create);
        this.w = authority;
        this.k = create.getHost();
        if (create.getPort() == -1) {
            this.l = nurVar.a;
        } else {
            this.l = create.getPort();
        }
        this.g = nurVar.b;
        long j = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j2 = 30;
            if (property != null) {
                try {
                    j2 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            j = j2 > 0 ? TimeUnit.SECONDS.toNanos(j2) : j2;
        }
        this.m = j;
        this.o = lgaVar;
        this.n = nurVar.c;
        Executor executor = nurVar.e;
        this.z = executor;
        this.A = executor != null ? false : z2;
        this.q = nurVar.d;
    }

    public static String e() {
        if (v == null) {
            try {
                v = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e2) {
                throw new RuntimeException(e2);
            }
        }
        return v;
    }

    private final void f() {
        if (this.r || this.y) {
            return;
        }
        if (this.p) {
            long j = this.m;
            if (j != 0 && (j <= 0 || this.o.a(TimeUnit.NANOSECONDS) <= this.m)) {
                return;
            }
        }
        this.r = true;
        this.z.execute(new nzx(this, this.B));
    }

    @Override // defpackage.nux
    public final String a() {
        return this.w;
    }

    @Override // defpackage.nux
    public final void b() {
        jdg.G(this.B != null, "not started");
        f();
    }

    @Override // defpackage.nux
    public final void c() {
        if (this.y) {
            return;
        }
        this.y = true;
        Executor executor = this.z;
        if (executor == null || !this.A) {
            return;
        }
        ofe.d(this.x, executor);
        this.z = null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.nux
    public final void d(nuu nuuVar) {
        jdg.G(this.B == null, "already started");
        if (this.A) {
            this.z = ofe.a(this.x);
        }
        this.B = nuuVar;
        f();
    }
}

package defpackage;

import com.google.android.libraries.inputmethod.trainingcache.storage.StorageAdapterFactory;
import j$.util.Objects;

/* compiled from: PG */
/* renamed from: dts  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dts implements rl {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dts(StorageAdapterFactory storageAdapterFactory, int i) {
        this.b = i;
        this.a = storageAdapterFactory;
    }

    public /* synthetic */ dts(dtt dttVar, int i) {
        this.b = i;
        this.a = dttVar;
    }

    public /* synthetic */ dts(dtu dtuVar, int i) {
        this.b = i;
        this.a = dtuVar;
    }

    public /* synthetic */ dts(hrx hrxVar, int i) {
        this.b = i;
        this.a = hrxVar;
    }

    public dts(hyx hyxVar, int i) {
        this.b = i;
        this.a = hyxVar;
    }

    @Override // defpackage.rl
    public final Object a(rj rjVar) {
        int i = this.b;
        if (i == 0) {
            ((dtt) this.a).a = rjVar;
            return "create initializationFuture";
        } else if (i == 1) {
            ((dtu) this.a).g = rjVar;
            return "create a new speakFuture";
        } else if (i == 2) {
            Object a = ((hrx) this.a).G.a();
            mkr G = hrx.G();
            Objects.requireNonNull(rjVar);
            gen genVar = (gen) a;
            genVar.l(G, new dop(rjVar, 6));
            genVar.h(hrx.G(), new doq(rjVar, 14));
            genVar.f(hrx.G(), new hrl(rjVar, 0));
            return "Get language preference from ULP for suggested languages.";
        } else if (i == 3) {
            ((hyx) this.a).f = rjVar;
            return rjVar;
        } else {
            Object obj = this.a;
            ixc ixcVar = (ixc) ijl.b().a(ixc.class);
            if (ixcVar != null) {
                rjVar.c(ixcVar);
                return "create-supported-protos-future";
            }
            StorageAdapterFactory storageAdapterFactory = (StorageAdapterFactory) obj;
            ixb ixbVar = new ixb(storageAdapterFactory, rjVar);
            storageAdapterFactory.listenerHolder = ixbVar;
            ijl.b().c(ixbVar, ixc.class, storageAdapterFactory.b);
            return "create-supported-protos-future";
        }
    }
}

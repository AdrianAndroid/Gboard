package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ags  reason: default package */
/* loaded from: classes.dex */
public class ags {
    public final Map b;

    public ags() {
        this.b = new LinkedHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ags(ags agsVar) {
        this();
        oll.e(agsVar, "initialExtras");
        this.b.putAll(agsVar.b);
    }
}

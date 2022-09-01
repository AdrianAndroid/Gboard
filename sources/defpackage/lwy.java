package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lwy  reason: default package */
/* loaded from: classes.dex */
public final class lwy extends lww {
    private static final Map c;
    private final lui d;

    static {
        lui[] values;
        EnumMap enumMap = new EnumMap(lui.class);
        for (lui luiVar : lui.values()) {
            lwy[] lwyVarArr = new lwy[10];
            for (int i = 0; i < 10; i++) {
                lwyVarArr[i] = new lwy(i, luiVar, luj.a);
            }
            enumMap.put((EnumMap) luiVar, (lui) lwyVarArr);
        }
        c = Collections.unmodifiableMap(enumMap);
    }

    private lwy(int i, lui luiVar, luj lujVar) {
        super(lujVar, i);
        lxj.b(luiVar, "format char");
        this.d = luiVar;
        if (lujVar.c()) {
            String str = luiVar.o;
            return;
        }
        int i2 = luiVar.l;
        i2 = lujVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        lujVar.f(sb);
        sb.append((char) i2);
    }

    public static lwy b(int i, lui luiVar, luj lujVar) {
        if (i >= 10 || !lujVar.c()) {
            return new lwy(i, luiVar, lujVar);
        }
        return ((lwy[]) c.get(luiVar))[i];
    }

    @Override // defpackage.lww
    public final void a(lwx lwxVar, Object obj) {
        lwxVar.a(obj, this.d, this.b);
    }
}

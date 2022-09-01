package defpackage;

import android.text.SpannedString;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* renamed from: ajr  reason: default package */
/* loaded from: classes.dex */
public final class ajr {
    public final Object a;
    public final Object b;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    public ajr(Map map) {
        this.a = map;
        this.b = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            afo afoVar = (afo) entry.getValue();
            List list = (List) this.b.get(afoVar);
            if (list == null) {
                list = new ArrayList();
                this.b.put(afoVar, list);
            }
            list.add((afk) entry.getKey());
        }
    }

    public static void a(List list, afv afvVar, afo afoVar, Object obj) {
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                afk afkVar = (afk) list.get(size);
                try {
                    int i = afkVar.a;
                    if (i == 0) {
                        afkVar.b.invoke(obj, new Object[0]);
                    } else if (i != 1) {
                        afkVar.b.invoke(obj, afvVar, afoVar);
                    } else {
                        afkVar.b.invoke(obj, afvVar);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }

    public ajr(CharSequence charSequence, ajq ajqVar) {
        this.a = SpannedString.valueOf(charSequence);
        this.b = ajqVar;
    }
}

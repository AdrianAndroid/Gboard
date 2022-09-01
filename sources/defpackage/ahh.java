package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* renamed from: ahh  reason: default package */
/* loaded from: classes.dex */
public final class ahh {
    private static final Object d = new Object();
    private static ahh e;
    public final Context a;
    private final Handler g;
    public final HashMap b = new HashMap();
    private final HashMap f = new HashMap();
    public final ArrayList c = new ArrayList();

    private ahh(Context context) {
        this.a = context;
        this.g = new ahf(this, context.getMainLooper());
    }

    public static ahh a(Context context) {
        ahh ahhVar;
        synchronized (d) {
            if (e == null) {
                e = new ahh(context.getApplicationContext());
            }
            ahhVar = e;
        }
        return ahhVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            ahg ahgVar = new ahg(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(ahgVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f.put(action, arrayList2);
                }
                arrayList2.add(ahgVar);
            }
        }
    }

    public final void c(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            ArrayList arrayList = (ArrayList) this.b.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                ahg ahgVar = (ahg) arrayList.get(size);
                ahgVar.d = true;
                for (int i = 0; i < ahgVar.a.countActions(); i++) {
                    String action = ahgVar.a.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f.get(action);
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            ahg ahgVar2 = (ahg) arrayList2.get(size2);
                            if (ahgVar2.b == broadcastReceiver) {
                                ahgVar2.d = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.f.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void d(Intent intent) {
        ArrayList arrayList;
        String str;
        int i;
        synchronized (this.b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            int flags = intent.getFlags() & 8;
            if (flags != 0) {
                StringBuilder sb = new StringBuilder("Resolving type ");
                sb.append(resolveTypeIfNeeded);
                sb.append(" scheme ");
                sb.append(scheme);
                sb.append(" of intent ");
                sb.append(intent);
            }
            ArrayList arrayList2 = (ArrayList) this.f.get(intent.getAction());
            if (arrayList2 != null) {
                if (flags != 0) {
                    new StringBuilder("Action list: ").append(arrayList2);
                }
                ArrayList arrayList3 = null;
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    ahg ahgVar = (ahg) arrayList2.get(i2);
                    if (flags != 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Matching against filter ");
                        sb2.append(ahgVar.a);
                    }
                    if (ahgVar.c) {
                        arrayList = arrayList2;
                        i = i2;
                        str = action;
                    } else {
                        arrayList = arrayList2;
                        str = action;
                        i = i2;
                        int match = ahgVar.a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (flags != 0) {
                                Integer.toHexString(match);
                            }
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(ahgVar);
                            ahgVar.c = true;
                        }
                    }
                    i2 = i + 1;
                    arrayList2 = arrayList;
                    action = str;
                }
                if (arrayList3 != null) {
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        ((ahg) arrayList3.get(i3)).c = false;
                    }
                    this.c.add(new azp(intent, arrayList3));
                    if (!this.g.hasMessages(1)) {
                        this.g.sendEmptyMessage(1);
                    }
                }
            }
        }
    }
}

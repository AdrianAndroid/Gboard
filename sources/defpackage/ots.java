package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: PG */
/* renamed from: ots  reason: default package */
/* loaded from: classes2.dex */
public final class ots implements InvocationHandler {
    public static final /* synthetic */ int c = 0;
    public boolean a;
    public String b;
    private final List d;
    private final /* synthetic */ int e;

    public ots(List list, int i) {
        this.e = i;
        this.d = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (this.e == 0) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = oqs.b;
            }
            if (!name.equals("supports") || Boolean.TYPE != returnType) {
                if (name.equals("unsupported") && Void.TYPE == returnType) {
                    this.a = true;
                    return null;
                } else if (name.equals("protocols") && objArr.length == 0) {
                    return this.d;
                } else {
                    if ((name.equals("selectProtocol") || name.equals("select")) && returnType == String.class && objArr.length == 1) {
                        Object obj2 = objArr[0];
                        if (obj2 instanceof List) {
                            List list = (List) obj2;
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                if (this.d.contains(list.get(i))) {
                                    String str = (String) list.get(i);
                                    this.b = str;
                                    return str;
                                }
                            }
                            String str2 = (String) this.d.get(0);
                            this.b = str2;
                            return str2;
                        }
                    }
                    if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                        return method.invoke(this, objArr);
                    }
                    this.b = (String) objArr[0];
                    return null;
                }
            }
            return true;
        }
        String name2 = method.getName();
        Class<?> returnType2 = method.getReturnType();
        if (objArr == null) {
            objArr = ohe.a;
        }
        if (name2.equals("supports") && Boolean.TYPE == returnType2) {
            return true;
        }
        if (name2.equals("unsupported") && Void.TYPE == returnType2) {
            this.a = true;
            return null;
        } else if (name2.equals("protocols") && objArr.length == 0) {
            return this.d;
        } else {
            if ((name2.equals("selectProtocol") || name2.equals("select")) && returnType2 == String.class && objArr.length == 1) {
                Object obj3 = objArr[0];
                if (obj3 instanceof List) {
                    List list2 = (List) obj3;
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (this.d.contains(list2.get(i2))) {
                            String str3 = (String) list2.get(i2);
                            this.b = str3;
                            return str3;
                        }
                    }
                    String str4 = (String) this.d.get(0);
                    this.b = str4;
                    return str4;
                }
            }
            if ((!name2.equals("protocolSelected") && !name2.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.b = (String) objArr[0];
            return null;
        }
    }
}

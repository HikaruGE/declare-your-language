package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.interpreter.core.Tools;

@SuppressWarnings("unused") public class Generic_A_initMethods__Arrow extends A_initMethods__Arrow implements IGenericNode
{ 
  public IStrategoTerm aterm;

  public Generic_A_initMethods__Arrow (INodeSource source, IStrategoTerm term) 
  { 
    this.setSourceInfo(source);
    this.aterm = term;
  }

  @Override public <T> T match(Class<T> clazz)
  { 
    return specialize(1).match(clazz);
  }

  @Override public void specializeChildren(int depth)
  { 
    throw new InterpreterException("Operation not supported", "aterm specializer", this);
  }

  @Override public A_initMethods__Arrow specialize(int depth)
  { 
    if(replaced())
    { 
      return (A_initMethods__Arrow)replacement();
    }
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final INodeSource source = NodeSource.fromStrategoTerm(term);
      if(name.equals("initMethods") && term.getSubtermCount() == 1)
      { 
        A_initMethods__Arrow replacement = replace(new initMethods_1(source, new L_A_Method(NodeSource.fromStrategoTerm(term.getSubterm(0))).fromStrategoTerm(term.getSubterm(0))));
        if(depth > 0)
        { 
          replacement.specializeChildren(depth - 1);
        }
        return replacement;
      }
    }
    IGenericNode replacement = null;
    throw new RewritingException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }

  public R_default_MM exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    return specialize(1).exec_default(_1, _2, _3);
  }
}